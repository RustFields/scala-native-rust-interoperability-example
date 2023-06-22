pub use operations::*;

pub mod operations {
    #[no_mangle]
    pub extern "C" fn divide(a: i32, b: i32) -> i32 {
        a / b
    }

    #[no_mangle]
    pub extern "C" fn generic_operation(
        x: i32,
        fun: extern fn(i32) -> i32
    ) -> i32 {
        fun(x)
    }
}