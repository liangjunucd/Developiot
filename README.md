# Developiot

````
#学习Push/pull
#花了时间感觉很不错！~~~
````

## 1. Upload the file and unzip it

tar -axvf generator-\$\{tar_package_name\}.tar.gz

## 2. updata config

cd generator/config/
vim application.properties
config "application.properties" file about rocketmq、redis、mysql

## 3. start generator.jar

cd generator/bin/
./start2.sh

## 4. check start success
cd generator/applogs
more generator.log(Started Application in 6.616 seconds)

## 5. Executing a business request

curl http://localhost:17090/white/list

return:
{"code":0,"requestId":null,"message":null,"result":null}

## 6. check file "device.txt"

cd generator/docs
more device.txt


## 7. Data sampling

Query the contents of the device.txt file to spot check if there is a myguard


## 8. Duplicate execution effects?

Repeated execution of the script has no impact on business

