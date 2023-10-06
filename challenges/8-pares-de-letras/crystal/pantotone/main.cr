word = ARGV[0]

pairs = [] of String

word.each_char_with_index do |char, index|
    if index % 2 == 0
        pairs.push(
            char + 
            word[index + 1]?.to_s.rjust(1, '$')
        )
    end
end

puts pairs.to_s.gsub("\"", "\'")
