def call(String dockerHubUser,String imageName,String imageTag){
    echo "Code Building In Progress"
    sh "whoami"
    sh "docker build -t ${dockerHubUser}/${imageName}:${imageTag} ."
    echo "Build Completed"

}
