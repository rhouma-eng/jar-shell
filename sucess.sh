echo "enter a name"
read name
if [[ $name = *" "* ]]; then
    echo "Illegal number of parameters"
else 
java -jar axaar-0.0.1-SNAPSHOT.jar $name
fi
cmd /k
