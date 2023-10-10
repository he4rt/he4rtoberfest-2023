def final_value_calcutator(parameters)
    loan_value = parameters[0].to_f
    interest_rate = parameters[1].to_i / 100.0
    time = parameters[2].to_i
    return loan_value * ((1 + interest_rate)**time)
end 

def parse_value(value)
    arr = value.split(',')
    return arr
end 

ARGV.each do |value|
    parameters = parse_value(value)
    puts '%.2f' % final_value_calcutator(parameters)
end