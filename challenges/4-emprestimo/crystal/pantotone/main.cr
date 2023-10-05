initial_value : Float64 = ARGV[0].to_f
fee_percentage : Int32 = ARGV[1].to_i
years : Int32 = ARGV[2].to_i

final = initial_value * (
    (1 + (fee_percentage / 100)) ** years
)

puts final