#[no_mangle]
pub extern "C" fn rep(func: extern "C" fn(i32) -> i32, input: i32) -> i32 {
    func(input)
}