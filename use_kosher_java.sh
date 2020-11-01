# Fix /Users/ben/src/kojo/git/kojo/Kojo-z/bin/java to use java from current ENV
# See ~/src/kojo/git/README.makezip

old='JAVA=java'
# backslashes needed for sed to work below
new='JAVA=\/Users\/ben\/src\/kojo\/git\/java'

dir=/Users/ben/src/kojo/git/kojo/Kojo-z/bin
rm -f $dir/kojo.org $dir/tmp
cp $dir/kojo $dir/kojo.org
sed "s/$old/$new/" $dir/kojo > $dir/tmp
mv -f $dir/tmp $dir/kojo
chmod +x $dir/kojo
echo $dir/kojo is ready to run.
