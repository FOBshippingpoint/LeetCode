my $url = prompt 'Please input the leetcode problem url: ';
$url ~~ / 'https://leetcode.com/problems/' (.*) /;
my $problem-name = $0.split('/')[0];

try {
  mkdir $problem-name;
  say "$problem-name directory created.";
  CATCH {
    default {
      say "Creating $problem-name";
    }
  }
}
