#!/bin/bash

set -euo pipefail

rootdir="$(dirname $0)"
builddir="$rootdir/build"

mkdir -p "$builddir"
cd "$builddir" || exit 1

wget -nc https://repo1.maven.org/maven2/so/dang/cool/z/3.0.0/z-3.0.0.jar

javac -cp z-3.0.0.jar -d "$builddir" "$rootdir/src/main/java/so/dang/cool/fiddle/Greet.java"

# https://www.graalvm.org/22.2/reference-manual/native-image/overview/Build-Overview/
/usr/lib/jvm/graalvm-ce-java17-22.2.0/bin/native-image \
    -cp z-3.0.0.jar:"$builddir" \
    --static \
    --native-image-info \
    --no-fallback \
    so.dang.cool.fiddle.Greet greet

