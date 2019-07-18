package com.fealo.leetjava;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public static void kmp_matcher(String t, String p) {
        int n = t.length();
        int m = p.length();

        int[] pie = compute_prefix_function(p);
        int q = 0;

        for (int i = 0; i < n; i++) {
            while (q > 0 && (p.charAt(q) != t.charAt(i))) {
                q = pie[q];
            }
            if (p.charAt(q) == t.charAt(i)) {
                q++;
            }

            if (q == m) {
                System.out.println("pattern occurs with shift " + (i-m));
            }

            q = pie[q];
        }
    }

    private static int[] compute_prefix_function(String p) {
        int[] array = new int[p.length()];

        array[0] = 0;
        int k = 0;

        for (int q = 1; q < p.length(); q++) {
            while (k > 0 && (p.charAt(k) != p.charAt(q))) {
                k = array[k];
            }

            if (p.charAt(k) == p.charAt(q)) {
                k++;
            }
            array[q] = k;
        }

        return array;
    }

}
