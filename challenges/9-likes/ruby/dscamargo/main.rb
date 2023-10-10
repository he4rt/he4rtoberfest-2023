args = ARGV[0].to_s.split(",")

people = []
args.each do |arg|
  name = arg.gsub(/[^a-zA-Z]/, '')
  people << name if name.length > 0
end

case people.length
when 0
  puts "Ninguem curtiu isso"
when 1
  puts people[0] + " curtiu isso"
when 2
  puts people[0] + " e " + people[1] + " curtiram isso"
when 3
  puts people[0] + ", " + people[1] + " e " + people[2] + " curtiram isso"
else
  puts people[0] + ", " + people[1] + " e outras " + (people.length - 2).to_s + " pessoas curtiram isso"
end