pub use divider::*;

pub mod divider {
    #[no_mangle]
    pub extern "C" fn divide(a: i32, b: i32) -> i32 {
        a / b
    }
}