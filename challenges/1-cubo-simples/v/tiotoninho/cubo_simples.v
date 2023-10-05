import os
import math

fn main() {
    x := os.args[1].u16()
    println(math.cube(x))
}