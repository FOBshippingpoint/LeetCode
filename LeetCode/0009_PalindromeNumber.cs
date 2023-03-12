/*
 * Date:    2023/0312
 * Problem: 9. Palindrome Number
 * Link:    https://leetcode.com/problems/palindrome-number/
 */

namespace LeetCode
{
    internal class PalindromeNumber
    {
        public bool IsPalindrome(int x)
        {
            if (x < 0)
            {
                return false;
            }
            char[] s = x.ToString().ToCharArray();
            for (int i = 0; i < s.Length / 2; i++)
            {
                char reverse = s[s.Length - 1 - i];
                if (s[i] != reverse)
                {
                    return false;
                }
            }
            return true;
        }
    }
}

