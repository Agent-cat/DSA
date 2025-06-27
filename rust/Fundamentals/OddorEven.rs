
// find the mumber is odd or even without using % operator
use std::io;
fn main() {
    let mut x = String::new();
    println!("Enter the value");
    io::stdin().read_line(&mut x).unwrap();
    let num: i32 = x.trim().parse().unwrap();

    if num & 1 == 0 {
        // Here we are getting the last bit of the number
        println!("The giver number is Even");
    } else {
        println!("The givern number is odd");
    }
}
