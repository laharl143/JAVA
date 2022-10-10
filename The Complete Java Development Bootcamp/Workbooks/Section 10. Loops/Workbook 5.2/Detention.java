import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        //Task 1 – Scan for the nextLine(), and print it 99 times. 
        
        String bart = scan.nextLine();

        for (int i = 1; i < 101; i++) {
            System.out.println(i + ". " + bart);
        }
        scan.close();
    }
}

/*
final output:
Hi Bart. I can write lines for you.
What do you want me to write?
I will not forget semi-colons;
1. I will not forget semi-colons;
2. I will not forget semi-colons;
3. I will not forget semi-colons;
4. I will not forget semi-colons;
5. I will not forget semi-colons;
6. I will not forget semi-colons;
7. I will not forget semi-colons;
8. I will not forget semi-colons;
9. I will not forget semi-colons;
10. I will not forget semi-colons;
11. I will not forget semi-colons;
12. I will not forget semi-colons;
13. I will not forget semi-colons;
14. I will not forget semi-colons;
15. I will not forget semi-colons;
16. I will not forget semi-colons;
17. I will not forget semi-colons;
18. I will not forget semi-colons;
19. I will not forget semi-colons;
20. I will not forget semi-colons;
21. I will not forget semi-colons;
22. I will not forget semi-colons;
23. I will not forget semi-colons;
24. I will not forget semi-colons;
25. I will not forget semi-colons;
26. I will not forget semi-colons;
27. I will not forget semi-colons;
28. I will not forget semi-colons;
29. I will not forget semi-colons;
30. I will not forget semi-colons;
31. I will not forget semi-colons;
32. I will not forget semi-colons;
33. I will not forget semi-colons;
34. I will not forget semi-colons;
35. I will not forget semi-colons;
36. I will not forget semi-colons;
37. I will not forget semi-colons;
38. I will not forget semi-colons;
39. I will not forget semi-colons;
40. I will not forget semi-colons;
41. I will not forget semi-colons;
42. I will not forget semi-colons;
43. I will not forget semi-colons;
44. I will not forget semi-colons;
45. I will not forget semi-colons;
46. I will not forget semi-colons;
47. I will not forget semi-colons;
48. I will not forget semi-colons;
49. I will not forget semi-colons;
50. I will not forget semi-colons;
51. I will not forget semi-colons;
52. I will not forget semi-colons;
53. I will not forget semi-colons;
54. I will not forget semi-colons;
55. I will not forget semi-colons;
56. I will not forget semi-colons;
57. I will not forget semi-colons;
58. I will not forget semi-colons;
59. I will not forget semi-colons;
60. I will not forget semi-colons;
61. I will not forget semi-colons;
62. I will not forget semi-colons;
63. I will not forget semi-colons;
64. I will not forget semi-colons;
65. I will not forget semi-colons;
66. I will not forget semi-colons;
67. I will not forget semi-colons;
68. I will not forget semi-colons;
69. I will not forget semi-colons;
70. I will not forget semi-colons;
71. I will not forget semi-colons;
72. I will not forget semi-colons;
73. I will not forget semi-colons;
74. I will not forget semi-colons;
75. I will not forget semi-colons;
76. I will not forget semi-colons;
77. I will not forget semi-colons;
78. I will not forget semi-colons;
79. I will not forget semi-colons;
80. I will not forget semi-colons;
81. I will not forget semi-colons;
82. I will not forget semi-colons;
83. I will not forget semi-colons;
84. I will not forget semi-colons;
85. I will not forget semi-colons;
86. I will not forget semi-colons;
87. I will not forget semi-colons;
88. I will not forget semi-colons;
89. I will not forget semi-colons;
90. I will not forget semi-colons;
91. I will not forget semi-colons;
92. I will not forget semi-colons;
93. I will not forget semi-colons;
94. I will not forget semi-colons;
95. I will not forget semi-colons;
96. I will not forget semi-colons;
97. I will not forget semi-colons;
98. I will not forget semi-colons;
99. I will not forget semi-colons;
100. I will not forget semi-colons;
 */
