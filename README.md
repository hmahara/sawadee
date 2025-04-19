# Deployment 

#### Create image
docker build -t hmahara/sawadee:1.0.0 .

#### Upload helm chart

curl -u user:password https://registry.domainname.com/repository/charts/ --upload-file sawadee-0.1.0.tgz 


### Database
sawadee @ k*b
port 53306
