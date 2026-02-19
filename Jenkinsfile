pipeline {
    agent any
    tools{
        maven "Maven3.8.8"
    }
    stages {
      //  stage('Chekcout SCM') {
        //    steps {
          //      git url:"https://github.com/ivantica2127/integracion-jenkins.git",
            //    branch:"main"
           // }
       // }
        stage("Compile"){
            steps {
                sh 'mvn clean compile -B -ntp'
            }
        }
        stage("Test"){
            steps{
                sh 'mvn test -B -ntp'
            }
        }
        stage("Build"){
            steps{
              sh 'mvn clean package -DskipTests -B -ntp'
            }
        }
    }
}
