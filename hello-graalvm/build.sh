#!/bin/bash



rootdir="$(dirname $0)"
builddir="$rootdir/build"

mkdir -p "$builddir"
cd "$builddir" || exit 1

javac -d "$builddir" "$rootdir/src/main/java/so/dang/cool/fiddle/Greet.java"

# https://www.graalvm.org/22.2/reference-manual/native-image/overview/Build-Overview/
# mandrel is a downstream of graalvm community edition (it was packaged for Void)
/usr/lib/jvm/mandrel11/bin/native-image --static --native-image-info so.dang.cool.fiddle.Greet greet
