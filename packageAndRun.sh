# use alias build which sources this: /Users/ben/src/kojo/git/packageAndRun.sh
echo "Build script called from `pwd`"
kojo_root=/Users/ben/src/kojo
cd $kojo_root/git/kojo
echo "Starting the build in `pwd`"
./makezip.sh
cd -
echo "Updating java to use from env (in `pwd`)"
source $kojo_root/git/use_kosher_java.sh
kojo_test=$HOME/tmp/kojo
mkdir -p $kojo_test
cd $kojo_test
echo "Starting kojo from `pwd`"
kojo &
cd -
