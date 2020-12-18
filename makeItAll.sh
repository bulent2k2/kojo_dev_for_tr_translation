# source /Users/ben/bin/makeItAll.sh

# combining two scripts:
#   ~/src/kojo/git/packageAndRun.sh which calls:
#   ~/src/kojo/git/use_kosher_java.sh

cwd=`pwd`
# use alias build which sources this: /Users/ben/bin/makeItAll.sh
echo "Build script (~/src/kojo/git/makeItAll.sh) called from $cwd"
kojo_root=/Users/ben/src/kojo
cd $kojo_root/git/kojo
echo "Starting the build in `pwd`"
./makezip.sh
cd -

echo "Updating java to use from env (in `pwd`)"
old='JAVA=java'
# backslashes needed for sed to work below
new='JAVA=\/Users\/ben\/src\/kojo\/git\/java'

dir=$kojo_root/git/kojo/Kojo-z/bin
rm -f $dir/kojo.org $dir/tmp
cp $dir/kojo $dir/kojo.org
sed "s/$old/$new/" $dir/kojo > $dir/tmp
mv -f $dir/tmp $dir/kojo
chmod +x $dir/kojo
echo $dir/kojo is ready to run.

cd $cwd
echo "Starting kojo from `pwd`"
#kojo &
/Users/ben/src/kojo/git/kojo_exe &
