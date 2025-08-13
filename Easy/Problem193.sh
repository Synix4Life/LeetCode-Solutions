# Runtime: 76ms -> Beats 6.13% of users
# Memory: 3.56MB -> Beats 44.79% of user

# Read from the file file.txt and output all valid phone numbers to stdout.
grep -E '^[0-9]{3}-[0-9]{3}-[0-9]{4}$|^\([0-9]{3}\) [0-9]{3}-[0-9]{4}$' file.txt
