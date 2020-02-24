//import groovy.json.JsonSlurper 

//@NonCPS
//pullreq(){
//def jsonSlurper = new JsonSlurper() 
//def reader = new BufferedReader(new InputStreamReader(new FileInputStream("/var/lib/jenkins/workspace/azd/out.json"),"UTF-8"))
//def resultJson = jsonSlurper.parse(reader)
//def projectid = resultJson.id
//} 
 

def call()
{
sh """
   curl --location --request GET 'https://dev.azure.com/vickysastryvs/d2/_apis/git/pullrequests?searchCriteria.status=all&api-version=5.1' \
--header 'Authorization: Basic dmlja3lzYXN0cnkudnNAb3V0bG9vay5jb206MnF4dmNoZWp2bzVzdHNzc3gyZXl5Mmp1azZ3ZHR6bnQ0eWJsb2Fwd2drd2FkdGQ0ZDNkYQ=='
 """
 
}
