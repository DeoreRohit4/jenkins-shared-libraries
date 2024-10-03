def call(String url,String branch){
       echo "Code Cloning In Progress"
       git url: "${url}", branch: "${branch}"
       echo "Code Cloned" 
}
