defmodule Solution do
  @spec is_palindrome(s :: String.t) :: boolean
  def is_palindrome(s) do
    s = String.downcase(s)
    s = String.replace(s, ~r/[^a-z0-9]/, "")
    s == String.reverse(s)
  end
end

