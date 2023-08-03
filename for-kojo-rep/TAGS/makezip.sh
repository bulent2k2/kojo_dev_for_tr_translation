#!/usr/bin/env bash
java -version
set -x 
# Build Kojo
rm -rf dist
./sbt.sh clean test buildDist

# Copy scala compiler jars with Turkish keywords
#tgt=/Users/ben/src/kojo/git/kojo/dist
tgt=dist
#TODO: from scalaVersion in build.sbt
tag=2.13.6
#TODO:
src=/Users/ben/src/scala-$tag/build/pack/lib
BU=$tgt/ORG
mkdir -p $BU
rm -if $BU/*.jar
mv $tgt/scala-compiler* $tgt/scala-library* $tgt/scala-reflect* $BU/
#TODO: tmp. We need to copy over these three jar files
ln -s $src/scala-compiler.jar $tgt/scala-compiler-$tag.jar
ln -s $src/scala-library.jar $tgt/scala-library-$tag.jar
ln -s $src/scala-reflect.jar $tgt/scala-reflect-$tag.jar

# Create staging area
rm -rf installerbuild
mkdir -p installerbuild/lib
cd installer
scala cp-staging-jars.scala
cd ..

cp -va installer/* installerbuild/
cd installerbuild
rm *.*
rm -rf Uninstaller
cp licenses/Kojo-license.txt .
cd ..
rm -rf Kojo-z Kojo-z??
mv installerbuild Kojo-z
rm Kojo.zip Kojo??.zip
zip -r Kojo.zip Kojo-z/*
