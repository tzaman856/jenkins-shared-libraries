def call(String Project, ImageTag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:{ImageTag} ."
}
