/*def call(jsondata){
def jsonString = jsondata
//println(jsonString)
def jsonObj = readJSON text: jsonString
println(jsonObj.environments.environment)
String a=jsonObj.environments.environment.deploy.key
//String a=jsonObj.alm.projects.project.name
String projectName=a.replaceAll("\\[", "").replaceAll("\\]","");
env.name = projectName
*/
def call(){
  //sh 'az extension add --name azure-devops' 
  sh 'cat /home/ec2-user/token.txt | az devops login --organization https://dev.azure.com/vickysastryvs/'
sh 'az repos create --name rrr --organization https://dev.azure.com/vickysastryvs --project d2'

}
