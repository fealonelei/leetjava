package com.fealo.leetjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
public class LeetjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeetjavaApplication.class, args);

		Solution solution = new Solution();
//		System.out.println(solution.intToRoman(1));
//
//		int[] nums = {-1,0,1,2,-1,-4};
//		solution.threeSum(nums);

//		SingleLinkedList singleLinkedList = new SingleLinkedList();
//		singleLinkedList.addNode(1);
//		singleLinkedList.addNode(2);
//		singleLinkedList.addNode(3);
//		singleLinkedList.addNode(4);
//		singleLinkedList.addNode(5);
//
//		singleLinkedList.reverseListNode(singleLinkedList.pointer_head);

//		solution.reverseBetween(singleLinkedList.pointer_head, 1, 3);
//        solution.removeNthFromEnd(singleLinkedList.pointer_head, 5);

//        int[] kSmallNums1 = {};//{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
//        int[] kSmallNums2 = {};//-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
//        List<int[]> result = solution.kSmallestPairs(kSmallNums1, kSmallNums2, 5);
//		System.out.println(result);
//
//		char[][] board = {	{'5','3','.','.','7','.','.','.','.'},
//							{'6','.','.','1','9','5','.','.','.'},
//							{'.','9','8','.','.','.','.','6','.'},
//							{'8','.','.','.','6','.','.','.','3'},
//							{'4','.','.','8','.','3','.','.','1'},
//							{'7','.','.','.','2','.','.','.','6'},
//							{'.','6','.','.','.','.','2','8','.'},
//							{'.','.','.','4','1','9','.','.','5'},
//							{'.','.','.','.','8','.','.','7','9'}};
//
//		boolean isValid = solution.isValidSudoku(board);
//		System.out.println(isValid);
//
//        int[] citations = {4,4,0,0};
//        int hIndex = solution.hIndex(citations);
//
//        int[] a = {4,9,5};
//        int[] b = {9,4,9,8,4};
//        int[] result = solution.intersect(a, b);
//
//        System.out.println(result);

//		solution.isValid("(){}{}[]");

//        int[] prices = {3,7,12,1,5,3,6,4,5,4,8};
//        solution.maxProfit(prices);
//
//        LRUCache lruCache = new LRUCache(5);
//
//		int[] array = {47, 29, 71,  99, 78, 19, 24, 47};
//		QuickSort quickSort = new QuickSort(array);
//		quickSort.sort();
//		quickSort.print();
//		StringUtils.kmp_matcher("bacbababaabcbab", "ababaca");

//		N_Queen nQueen = new N_Queen();
//		List<List<String>> llString = nQueen.solveNQueens(4);
//		int total = nQueen.totalNQueens(4);
//		System.out.println(total);

//		int[] nums = {1,2,3};
//		List<List<Integer>> llInteger = solution.subsets(nums);
//		System.out.println(llInteger);
//
//		List<Integer> row = solution.getRow(5);
//		System.out.println(row);
//
//		boolean isValid = solution.checkValidString("*()()*())*(*(*)))(()");
//		System.out.println(isValid);
//
//		int[] result = solution.diStringMatch("DIDIDIDIDIDIDIDIDIDIDIDIDIDIDIIDIDIDIDDDDIDIDIDIDIIIIDDIDIDID");
//		System.out.println(result);

//		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//		List<Integer> result = solution.spiralOrder(matrix);
//		System.out.println(result);

		int result = solution.divide(20, -3);
		System.out.print(result);
	}
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    public void setNext(ListNode val_node){/*设置节点的下一个节点*/
        next = val_node;
    }
    public ListNode getNext(){/*获取节点的下一个节点*/
        return next;
    }
    public void printNode(){  /*输出节点数据*/
        System.out.println(this.val+" ");
    }
}

class BiNode {
	private int val;
	private BiNode left;
	private BiNode right;

	boolean isVisited = false;

	BiNode(int x) { val = x; }

	public void setLeft(BiNode val_node) { left = val_node; }
	public BiNode getLeft() { return left; }
	public void setRight(BiNode val_node) { right = val_node; }
	public BiNode getRight() { return right; }

	public int getVal() {
		isVisited = true;
		return val;
	}

}

class BiTree {

}


class SingleLinkedList {/*单链表类*/

    ListNode pointer_head, pointer_tail;/*链表的头指针和尾指针，都是伪指针，实属节点*/

    public SingleLinkedList() {/*单链表构造函数*/
        pointer_head = pointer_tail = null;/*指针初始化都为空*/
    }

    public boolean isEmpty() {/*判断链表是否为空函数*/
        return pointer_head == null;
    }

    public void addNode(int val_data) {/*链表增加节点函数*/
        if (this.isEmpty()) {/*判断链表是否为空*/
            pointer_head = pointer_tail = new ListNode(val_data);/*链表为空，头指针和尾指针都指向新增节点*/
        } else {
            pointer_tail.setNext(new ListNode(val_data));/*链表不为空，新增节点连接到表尾，尾指针指向新增节点*/
            pointer_tail = pointer_tail.getNext();
        }
    }

    public void printListNode() {/*输出链表函数*/
        for (ListNode temp = pointer_head; temp != null; temp = temp.getNext()) {
            temp.printNode();
        }

    }

    public ListNode reverseListNode(ListNode listNode) {
    	if (listNode == null || listNode.next == null) {
    		return listNode;
		}

		ListNode qian = null;
    	ListNode hou = null;

    	while (listNode != null) {
    		hou = listNode.next;
    		listNode.next = qian;

    		qian = listNode;
    		listNode = hou;
		}

		return qian;
	}

}

class Solution {
	public String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();

		int thousand = num / 1000;
		if (thousand == 0) {
		} else if (thousand == 1) {
			sb.append("M");
		} else if (thousand == 2) {
			sb.append("MM");
		} else if (thousand == 3) {
			sb.append("MMM");
		}

		int hundred = num % 1000 / 100;

		if (hundred == 0) {
		} else {
			switch (hundred) {
				case 1:
					sb.append("C");
					break;
				case 2:
					sb.append("CC");
					break;
				case 3:
					sb.append("CCC");
					break;
				case 4:
					sb.append("CD");
					break;
				case 5:
					sb.append("D");
					break;
				case 6:
					sb.append("DC");
					break;
				case 7:
					sb.append("DCC");
					break;
				case 8:
					sb.append("DCCC");
					break;
				case 9:
					sb.append("CM");
					break;
				default:
					break;
			}
		}

		int ten = num % 100 / 10;
		if (ten == 0){
		} else {
			switch (ten) {
				case 1:
					sb.append("X");
					break;
				case 2:
					sb.append("XX");
					break;
				case 3:
					sb.append("XXX");
					break;
				case 4:
					sb.append("XL");
					break;
				case 5:
					sb.append("L");
					break;
				case 6:
					sb.append("LX");
					break;
				case 7:
					sb.append("LXX");
					break;
				case 8:
					sb.append("LXXX");
					break;
				case 9:
					sb.append("XC");
					break;
				default:
					break;
			}
		}

		int single = num % 10;
		if (single == 0){
		} else {
			switch (single) {
				case 1:
					sb.append("I");
					break;
				case 2:
					sb.append("II");
					break;
				case 3:
					sb.append("III");
					break;
				case 4:
					sb.append("IV");
					break;
				case 5:
					sb.append("V");
					break;
				case 6:
					sb.append("VI");
					break;
				case 7:
					sb.append("VII");
					break;
				case 8:
					sb.append("VIII");
					break;
				case 9:
					sb.append("IX");
					break;
				default:
					break;
			}
		}

		return sb.toString();
	}

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> listList = new ArrayList<List<Integer>>();

        if (nums == null || nums.length < 3) {
            return listList;
        }

        Arrays.sort(nums);

        for (int third = 0; third < nums.length; third++) {
            if (nums[third] > 0) break;
            if (third > 0 && nums[third] == nums[third - 1]) continue;

            int target = -nums[third];
            int header = third+1, trailer = nums.length - 1;

            while (header < trailer) {
                int sum = nums[header] + nums[trailer];

                if (sum == target) {
                    List<Integer> list = Arrays.asList(nums[header], nums[third], nums[trailer]);
                    listList.add(list);

                    while (header < trailer && nums[header] == nums[header + 1]) ++header;
                    while (header < trailer && nums[trailer] == nums[trailer - 1]) --trailer;
                    ++header; --trailer;

                } else if (sum < target) {
                    ++header;
                } else {
                    --trailer;
                }

            }
        }

		return listList;
	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
	    if (head == null || m == n) {
	        return head;
        }

        ListNode virtualHead = new ListNode(0);
	    virtualHead.next = head;

	    ListNode nodeBeforeM = virtualHead;
	    ListNode indexNode = nodeBeforeM;

	    for (int i = 1; i < m; i++) {
	        indexNode = indexNode.next;
        }
        nodeBeforeM = indexNode;

        ListNode pre = indexNode;
        indexNode = indexNode.next;
        ListNode next = indexNode;

        for (int j = m; j <= n; j++) {
            next = indexNode.next;
            indexNode.next = pre;
            pre = indexNode;
            indexNode = next;
        }

        nodeBeforeM.next.next = indexNode;
        nodeBeforeM.next = pre;

        return virtualHead.next;
	}

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        ListNode frontNode = head, backNode = head;

        for(int i = 1; i <= n; i++) {
            frontNode = frontNode.next;
        }

        if (frontNode == null) {
            return head.next;
        }

        while (frontNode.next != null) {
            frontNode = frontNode.next;
            backNode = backNode.next;
        }

        backNode.next = backNode.next.next;

        return head;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergedList = new ListNode(0) ;
        ListNode head = mergedList;

        while (l1.next != null && l2.next != null) {
            if (l1.val < l2.val) {
                mergedList.next = l1;
                l1 = l1.next;
            } else {
                mergedList.next = l2;
                l2 = l2.next;
            }

            mergedList = mergedList.next;
        }

        if (l1.next != null) {
            mergedList.next = l1;
        } else {
            mergedList.next = l2;
        }

	    return head.next;
    }

	public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		List<int[]> result = new ArrayList<>(k);

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {

				int sum = nums1[i] + nums2[j];

				int[] temp = {nums1[i], nums2[j]};

				if (result.size() >= k) {

					int[] lastOne = result.get(k-1);
					int lastSum = lastOne[0]+lastOne[1];

					if (sum > lastSum) {
						break;
					} else {
						int insertIndex = Integer.MAX_VALUE;

						for (int index=0; index < k; index++) {
							int[] indexArray = result.get(index);
							int indexSum = indexArray[0]+indexArray[1];

							if (sum <= indexSum) {
								insertIndex = index;
								break;
							}
						}
						if (insertIndex < Integer.MAX_VALUE) {
							result.add(insertIndex, temp);
						}
					}
				} else {
					int insertIndex = Integer.MAX_VALUE;

					for (int index=0; index < result.size(); index++) {
						int[] indexArray = result.get(index);
						int indexSum = indexArray[0]+indexArray[1];

						if (sum <= indexSum) {
							insertIndex = index;
							break;
						}
					}

					if (result.size() > insertIndex) {
						result.add(insertIndex, temp);
					} else {
						result.add(temp);
					}
				}
			}
		}

		if (result.size() > k) {
			result.subList(k, result.size()).clear();
		}
		return  result;
	}

	public boolean isValidSudoku(char[][] board) {

		List<Set> rowSets = new ArrayList<>(9);
		List<Set> columnSets = new ArrayList<>(9);
		List<Set> squareSets = new ArrayList<>(9);
		for (int i = 0; i < 9; i++) {
			rowSets.add(new HashSet(9));
			columnSets.add(new HashSet(9));
			squareSets.add(new HashSet(9));
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {
					continue;
				}

				int squareIndex = i/3 + j/3 * 3;

				if (!rowSets.get(i).add(board[i][j]) ||
						!columnSets.get(j).add(board[i][j]) ||
						!squareSets.get(squareIndex).add(board[i][j])) {
					return false;
				}
			}
		}

		return true;
	}

	public void solveSudoku(char[][] board) {

		List<Set> rowSets = new ArrayList<>(9);
		List<Set> columnSets = new ArrayList<>(9);
		List<Set> squareSets = new ArrayList<>(9);
		for (int i = 0; i < 9; i++) {
			rowSets.add(new HashSet(9));
			columnSets.add(new HashSet(9));
			squareSets.add(new HashSet(9));
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					continue;
				}






			}
		}




	}


    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) {
            return 0;
        }

        int[] nums = IntStream.of(citations)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for(int i = 0; i < nums.length; i++) {
            if (i+1 >= nums[i]) {
                return Math.max(i, nums[i]);
            }
        }

	    return nums.length;
    }

	public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }
        }
        return list.stream().mapToInt(n->n).toArray();
	}

	public boolean isValid(String s) {

		if (s == null || s.isEmpty() || s.length() % 2 != 0) {
			return false;
		}

		Stack<Character> stack = new Stack<>();

		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.empty()) return false;

				if (c == ')' && stack.pop() != '(') return false;
				if (c == ']' && stack.pop() != '[') return false;
				if (c == '}' && stack.pop() != '{') return false;
			}
		}

		return stack.empty();
	}

	public int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
	}

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0 || nums.length == 1) {
			return nums.length;
		}

		int count = 1;
		int lastOne = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == lastOne) {
				continue;
			}
			lastOne = nums[i];
			nums[count] = nums[i];
			count++;
		}


		return count;
	}

	public int titleToNumber(String s) {
		int number = 0;
		for (int i = 0; i < s.length(); i++) {
			char cc = s.charAt(i);

			number = 26 * number + cc - 0x40;
		}

		return number;
	}

	public List<List<Integer>> subsets(int[] nums) {
		int length = nums.length;
		List<List<Integer>> subsets = new ArrayList<>(2<<length);
		if (nums == null || nums.length == 0) {
			return subsets;
		}

		subsets.add(Collections.emptyList());
		for (int i: nums) {
			int preSize = subsets.size();
			for (int k = 0; k < preSize; k++) {
				List<Integer> combineSubset = new ArrayList<>(subsets.get(k));
				combineSubset.add(i);
				subsets.add(combineSubset);
			}
		}

		return subsets;
	}

	private int[] num(int index, int[] nums) {
		int[] result = new int[nums.length - 1];
		for (int i = 0; i < nums.length-1; i++) {
			if (i < index) {
				result[i] = nums[i];
			} else if (i > index) {
				result[i] = nums[i+1];
			}
		}
		return result;
	}

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		int length = nums.length;
		List<List<Integer>> subsets = new ArrayList<>(2<<length);
		if (nums == null || nums.length == 0) {
			return subsets;
		}

		subsets.add(Collections.emptyList());
		for (int i: nums) {
			int preSize = subsets.size();
			for (int k = 0; k < preSize; k++) {
				List<Integer> combineSubset = new ArrayList<>(subsets.get(k));
				combineSubset.add(i);
				Collections.sort(combineSubset);
				if (!subsets.contains(combineSubset)) {
					subsets.add(combineSubset);
				}
			}
		}

		return subsets;
	}

	public List<Integer> getRow(int rowIndex) {
		List<Integer> result = new ArrayList<>(rowIndex+1);

		if (rowIndex == 0) {
			result.add(1);
			return result;
		} else if (rowIndex == 1) {
			result.add(1);
			result.add(1);
			return result;
		}

		result.add(1);
		result.add(1);
		List<Integer> temp = new ArrayList<Integer>(Collections.nCopies(rowIndex+1, 0));
		for (int i = 2; i <= rowIndex; i++) {
			temp.set(0, 1);
			temp.set(i, 1);
			for (int j = 1; j < result.size(); j++) {
				temp.set(j, result.get(j-1)+result.get(j));
			}
			result = new ArrayList<>(temp.subList(0,i+1));
		}

		return result;
	}

	public boolean checkValidString(String s) {
		if (s == null) return false;
		if (s.length() == 0) return true;

		int leftGreedy = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '*') {
				leftGreedy++;
			} else {
				leftGreedy--;
			}
			if (leftGreedy < 0) return false;
		}
		if (leftGreedy == 0) return true;

		int rightGreedy = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (c == ')' || c == '*') {
				rightGreedy++;
			} else {
				rightGreedy--;
			}
			if (rightGreedy < 0) return false;
		}

		return true;
	}

	public int[] diStringMatch(String s) {
		int length = s.length();
		int[] result = new int[length+1];
		int low = 0, high = length;

		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);

			if (c == 'I') {
				result[i] = low++;
			} else {
				result[i] = high--;
			}
		}
		result[length] = low;

		return result;
	}

	public List<Integer> spiralOrder(int[][] matrix){
		List answer = new ArrayList();
		if (matrix.length == 0) return answer;
		int row = matrix.length, column = matrix[0].length;
		boolean[][] hasVisited = new boolean[row][column];

		int[] directionRow = {0,1,0,-1};
		int[] directionColumn = {1,0,-1,0};
		int currentRow = 0, currentColumn = 0, direction = 0;

		for (int i = 0; i < row * column; i++) {
			answer.add(matrix[currentRow][currentColumn]);
			hasVisited[currentRow][currentColumn] = true;

			int nextRowPosition = currentRow + directionRow[direction];
			int nextColumnPosition = currentColumn + directionColumn[direction];

			if (0 <= nextRowPosition && nextRowPosition < row
					&& 0 <= nextColumnPosition && nextColumnPosition < column &&
					!hasVisited[nextRowPosition][nextColumnPosition]) {
				currentRow = nextRowPosition;
				currentColumn = nextColumnPosition;
			} else {
				direction = (direction+1)%4;
				currentRow += directionRow[direction];
				currentColumn += directionColumn[direction];
			}
		}

		return answer;
	}

	public boolean canJump(int[] nums) {
		/* implement in Swift
		var iiii = nums.count - 1
		for i in stride(from: nums.count - 1, through: 0, by: -1) {
			if nums[i] + i >= iiii {
				iiii = i
			}
		}

		return iiii == 0

		*/
		return false;
	}
	public int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int result = 0;
        int a1 = Math.abs(dividend);
        int a2 = Math.abs(divisor);
        while (a1 - a2 >= 0) {
            int pow = 0;
            while (a1 - (a2 << 1 << pow) >= 0) {
                pow++;
            }
            result += 1 << pow;
            a1 -= a2 << pow;
        }
        return (dividend >= 0) == (divisor >= 0) ? result : -result;
    }
}































