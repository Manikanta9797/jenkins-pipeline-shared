import groovy.json.JsonSlurper 

@NonCPS
deleteProject(){
def jsonSlurper = new JsonSlurper() 
def reader = new BufferedReader(new InputStreamReader(new FileInputStream("/var/lib/jenkins/workspace/azd/out.json"),"UTF-8"))
def resultJson = jsonSlurper.parse(reader)
def projectid = resultJson.id
 
 sh """
   curl --location --request GET 'https://dev.azure.com/vickysastryvs/_apis/projects/mani/teams?api-version=5.1' \
--header 'Authorization: Basic dmlja3lzYXN0cnkudnNAb3V0bG9vay5jb206enN4YXBrajN6d2s2cnR6N3ptNHR5bGk3YXlrN3l0NXllaHA1aWM3ZXJsZWM0eHNmN3R5YQ==' -o team.json
 
 """
}
def call()
{
deleteProject()
}