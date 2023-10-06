people = []
ARGV.each do |arg|
  people << arg
end

case people.length
when 0
  puts "Ninguem curtiu isso"
when 1
  puts ARGV[0] + " curtiu isso"
when 2
  puts ARGV[0] + " e " + ARGV[1] + " curtiram isso"
when 3
  puts ARGV[0] + ", " + ARGV[1] + " e " + ARGV[2] + " curtiram isso"
else
  puts ARGV[0] + ", " + ARGV[1] + " e outras " + (people.length - 2).to_s + " pessoas curtiram isso"
end