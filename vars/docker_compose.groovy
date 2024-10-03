def call(){
        echo "Code is deploying"
        //sh "docker compose up -d"
        sh 'docker compose down && docker compose up -d'
        echo "Code Deployed"
}
