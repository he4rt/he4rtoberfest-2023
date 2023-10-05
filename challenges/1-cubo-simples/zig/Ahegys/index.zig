const std = @import("std");

const argsSetup = struct {
    const   maxLen: i8 = 2;
    const   argLocation: i8 = 1;
    const   exePath: i8 = 0;
    const   maxArgNum: i32 = 999999;
    const   intBase: i8 = 10;
};

pub fn main() !void {
    var     gpa = std.heap.GeneralPurposeAllocator(.{}){};
    defer   _ = gpa.deinit();

    const   allocator = gpa.allocator();
    const   args = try std.process.argsAlloc(allocator);
    
    defer std.process.argsFree(allocator, args);

    if (args.len < argsSetup.maxLen or args.len > argsSetup.maxLen) {
        std.debug.print("invalid number of arguments: {s} [NUMBER]\n", .{args[argsSetup.exePath]});
        return error.InvalidArguments;
    }

    const getNum = try std.fmt.parseInt(i64, args[argsSetup.argLocation], argsSetup.intBase);
    if (getNum > argsSetup.maxArgNum) {
        std.debug.print("number too large: {d}\n", .{getNum});
        return error.LargeNumbers;
    }

    const result: i64 = (getNum * getNum) * getNum;
    std.debug.print("args: {d}",.{result});
}