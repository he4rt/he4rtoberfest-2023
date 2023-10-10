degreesInput = ARGV[0].to_i
degrees = degreesInput % 360

# Static values
fullRotation = 360
maxHours = 12
maxMinutesPerHour = 60
degreesPerHour = fullRotation / maxHours
degreesPerMinute = degreesPerHour / maxMinutesPerHour

# Calculate hours/minutes
fullMinutes = degrees / degreesPerMinute

hour = (fullMinutes / 60).to_i
minutes = (fullMinutes % 60).to_i

puts "%s:%s" % [
    hour.to_s.rjust(2, '0'), 
    minutes.to_s.rjust(2, '0')
]