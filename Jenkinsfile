pipeline { 
agent any 
environment { MAVEN_HOME = tool 'Maven' } 
stages { 
stage('Checkout Code') { 
steps { 
git branch: 'main', credentialsId: 'GitHub-Credentials', url: 'https://github.com/itsswatidubey/myfirst.git' 
} 
} 
steps { 
script { 
dir('myfirst') { 
if (isUnix()) { 
sh "\${MAVEN_HOME}/bin/mvn clean package" 
} else { 
bat "\${MAVEN_HOME}\\bin\\mvn clean package" 
} 
} 
} 
} 
stage('Deploy to Tomcat') { 
steps { 
deploy adapters: [tomcat9(credentialsId: 'tomcat-cred', path: '', url: 'http://localhost:9090/manager')], war: '**/*.war' 
} 
} 
} 
