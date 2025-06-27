
// return the number of ones in the decimal value of the given number

use std::io;
fn main() {
    let mut x = String::new();
    let mut flag: i32 = 0;
    io::stdin().read_line(&mut x).unwrap();
    let mut num: i32 = x.trim().parse().unwrap();
    while num != 0 {
        if (num & 1) == 1 {
            flag = flag + 1;
        }
        num = num >> 1;
    }
    println!("The number of 1's are : {}", flag);
}
