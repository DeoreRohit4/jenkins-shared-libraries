def call(String imageName, String imageTag, String dockerHubUser){
                echo "Pushing image to docker hub"
                withCredentials([usernamePassword('credentialsId':"dockerhubcred",passwordVariable:"HUBPASS",usernameVariable:"USERNAME")]){
                sh "docker login -u ${env.USERNAME} -p ${env.HUBPASS}"
                sh "docker image tag  ${imageName}:${imageTag} ${env.USERNAME}/${imageName}:${imageTag}"
                sh "docker push ${env.USERNAME}/${imageName}:${imageTag}"
                echo "Image Pushed"
                }
}
