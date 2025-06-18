package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {

        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMills = System.currentTimeMillis();
        System.out.println("currentTImeMills = " + currentTimeMills);

        // 현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽는다.
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사
        char[] originalArray = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        System.exit(0);
    }
}

/*
currentTImeMills = 1750220516167
currentTimeNano = 312356672204166
getenv = {HOMEBREW_PREFIX=/opt/homebrew, IDEA_INITIAL_DIRECTORY=/, COMMAND_MODE=unix2003, LC_CTYPE=ko_KR.UTF-8, PYENV_ROOT=/Users/byeonguk/.pyenv, INFOPATH=/opt/homebrew/share/info:, SHELL=/bin/zsh, TMPDIR=/var/folders/md/k_17h8794674m2rm4xcf7ldc0000gn/T/, __CFBundleIdentifier=com.jetbrains.intellij, HOME=/Users/byeonguk, SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.nLTljIj9Xn/Listeners, HOMEBREW_REPOSITORY=/opt/homebrew, OLDPWD=/, XPC_SERVICE_NAME=application.com.jetbrains.intellij.629317.630122, PATH=/Users/byeonguk/.pyenv/shims:/Users/byeonguk/.pyenv/bin:/Users/byeonguk/.npm-global/bin:/Library/Frameworks/Python.framework/Versions/3.13/bin:/Library/Frameworks/Python.framework/Versions/3.12/bin:/opt/homebrew/bin:/opt/homebrew/sbin:/usr/local/bin:/System/Cryptexes/App/usr/bin:/usr/bin:/bin:/usr/sbin:/sbin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/local/bin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/bin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/appleinternal/bin:/Users/byeonguk/.local/bin:/Users/byeonguk/Library/Python/3.13/bin:/Users/byeonguk/.local/bin:/Users/byeonguk/Library/Python/3.13/bin, LOGNAME=byeonguk, USER=byeonguk, __CF_USER_TEXT_ENCODING=0x1F5:0x3:0x33, XPC_FLAGS=0x0, HOMEBREW_CELLAR=/opt/homebrew/Cellar, PWD=/Users/byeonguk/Desktop/java-mid}
properties = {java.specification.version=22, sun.jnu.encoding=UTF-8, java.class.path=/Users/byeonguk/Desktop/java-mid/out/production/java-mid, java.vm.vendor=Oracle Corporation, sun.arch.data.model=64, java.vendor.url=https://java.oracle.com/, java.vm.specification.version=22, os.name=Mac OS X, sun.java.launcher=SUN_STANDARD, user.country=KR, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk-22.jdk/Contents/Home/lib, sun.java.command=lang.system.SystemMain, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16|lx.astxsvc.com|*.lx.astxsvc.com|127.0.0.1:21300|*.127.0.0.1:21300, jdk.debug=release, sun.cpu.endian=little, user.home=/Users/byeonguk, user.language=ko, sun.stderr.encoding=UTF-8, java.specification.vendor=Oracle Corporation, java.version.date=2024-04-16, java.home=/Library/Java/JavaVirtualMachines/jdk-22.jdk/Contents/Home, file.separator=/, java.vm.compressedOopsMode=Zero based, sun.stdout.encoding=UTF-8, line.separator=
, java.vm.specification.vendor=Oracle Corporation, java.specification.name=Java Platform API Specification, apple.awt.application.name=SystemMain, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16|lx.astxsvc.com|*.lx.astxsvc.com|127.0.0.1:21300|*.127.0.0.1:21300, java.runtime.version=22.0.1+8-16, user.name=byeonguk, stdout.encoding=UTF-8, path.separator=:, os.version=15.5, java.runtime.name=Java(TM) SE Runtime Environment, file.encoding=UTF-8, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, java.vendor.url.bug=https://bugreport.java.com/bugreport/, java.io.tmpdir=/var/folders/md/k_17h8794674m2rm4xcf7ldc0000gn/T/, java.version=22.0.1, user.dir=/Users/byeonguk/Desktop/java-mid, os.arch=aarch64, java.vm.specification.name=Java Virtual Machine Specification, native.encoding=UTF-8, java.library.path=/Users/byeonguk/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.vm.info=mixed mode, sharing, stderr.encoding=UTF-8, java.vendor=Oracle Corporation, java.vm.version=22.0.1+8-16, sun.io.unicode.encoding=UnicodeBig, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16|lx.astxsvc.com|*.lx.astxsvc.com|127.0.0.1:21300|*.127.0.0.1:21300, java.class.version=66.0}
Java version: 22.0.1
copiedArray = [C@38af3868
Arrays.toString = [h, e, l, l, o]
*/