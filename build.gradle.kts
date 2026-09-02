plugins {
    // Với Fabric Loom dành cho Minecraft 1.21.11 trở về trước
    id 'net.fabricmc.fabric-loom-remap' version '1.9.2'
    id 'maven-publish'
}

sourceCompatibility = JavaVersion.VERSION_21
targetCompatibility = JavaVersion.VERSION_21

// Bật --enable-preview để sửa triệt để lỗi "unnamed variables"
tasks.withType(JavaCompile).configureEach {
    it.options.release = 21
    it.options.compilerArgs.add('--enable-preview')
}

dependencies {
    minecraft "com.mojang:minecraft:1.21.11"
    mappings "net.fabricmc:yarn:1.21.11+build.1:v2"
    modImplementation "net.fabricmc:fabric-loader:0.16.10"
    
    // Thêm Fabric API phiên bản 1.21.11 nếu project của bạn có dùng
    modImplementation "net.fabricmc.fabric-api:fabric-api:0.141.2+1.21.11"
}
