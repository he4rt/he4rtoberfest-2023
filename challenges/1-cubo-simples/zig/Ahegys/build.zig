const std = @import("std");

pub fn build(builder: *std.Build) void {
    const target = builder.standardTargetOptions(.{});

    const optimize = builder.standardOptimizeOption(.{});

    const exe = builder.addExecutable(.{
        .name = "cube",
        .root_source_file = .{ .path = "./index.zig" },
        .target = target,
        .optimize = optimize,

    });

    builder.installArtifact(exe);
}