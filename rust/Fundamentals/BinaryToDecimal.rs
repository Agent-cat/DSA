
use std::io;
fn main() {
    let mut x = String::new();
    println!("Enter the value to convert into bits");
    io::stdin().read_line(&mut x).unwrap();
    let mut num: i32 = x.trim().parse().unwrap();
    while num != 0 {
        let lastbit = num & 1;
        print!("{}", lastbit);
        num = num >> 1;
    }
}
