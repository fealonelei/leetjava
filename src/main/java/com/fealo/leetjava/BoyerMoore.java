package com.fealo.leetjava;

public class BoyerMoore {
    private final int R; // the radix
    private int[] right; // the bad character skip array

    private char[] pattern; // store the pattern as a character array
    private String pat;     // or as a string

    public BoyerMoore(String pat) {
        this.R = 256;
        this.pat = pat;

        // position of rightmost occurrence of c in the pattern
        right = new int[R];
        for(int c = 0; c < R; c++) {
            right[c] = -1;
        }
        for(int j = 0; j < pat.length(); j++) {
            right[pat.charAt(j)] = j;
        }
    }

    public BoyerMoore(char[] pattern, int R) {
        this.R = R;
        this.pattern = new char[pattern.length];
        for(int j = 0; j < pattern.length; j++) {
            this.pattern[j] = pattern[j];
        }

        right = new int[R];
        for(int c = 0; c < R; c++) {
            right[c] = -1;
        }
        for(int j = 0; j < pattern.length; j++) {
            right[pattern[j]] = j;
        }
    }

    public int search(String txt) {
        int m = pat.length();
        int n = txt.length();
        int skip;
        for(int i = 0; i <= n - m; i+= skip) {
            skip = 0;
            for(int j = m - 1; j >= 0; j--) {
                if (pat.charAt(j) != txt.charAt(i+j)) {
                    skip = Math.max(1, j - right[txt.charAt(i+j)]);
                    break;
                }
            }
            if (skip == 0) return i;
        }
        return n;
    }

    public int search(char[] text) {
        int m = pattern.length;
        int n = text.length;
        int skip;
        for(int i = 0; i < n - m; i+= skip) {
            skip = 0;
            for(int j = m - 1; j >= 0; j--) {
                if (pattern[j] != text[i+j]) {
                    skip = Math.max(1, j - right[text[i+j]]);
                    break;
                }
            }
            if (skip == 0) return i;
        }
        return n;
    }

    public static void bmtest(String pat, String txt) {
        char[] pattern = pat.toCharArray();
        char[] text = txt.toCharArray();

        BoyerMoore boyerMoore1 = new BoyerMoore(pat);
        BoyerMoore boyerMoore2 = new BoyerMoore(pattern, 256);
        int offset1 = boyerMoore1.search(txt);
        int offset2 = boyerMoore2.search(text);

        System.out.println("text:    " + txt);

        System.out.print("pattern: ");
        for (int i = 0; i < offset1; i++) {
            System.err.print(" ");
        }
        System.out.println(pat);

        System.out.print("pattern: ");
        for (int i = 0; i < offset2; i++) {
            System.out.print(" ");
        }
        System.out.println(pat);
    }
}
