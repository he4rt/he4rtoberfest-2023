require 'minitest/autorun'

class HelloWorld
  def self.greet
    [72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33].map { |c| c.chr }.join
  end
end

class HelloWorldTest < Minitest::Test
  def test_greet
    assert_equal "Hello, World!", HelloWorld.greet
  end
end

puts HelloWorld.greet
