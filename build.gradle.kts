
apply plugin: 'war'

webAppDirName = 'WebContent'
sourceCompatibility = "1.7"; 
targetCompatibility = "1.7";

repositories {
	mavenCentral()
}

sourceSets {
    main {
        java {
            srcDirs = ['src']
        }
		resources {
            srcDirs = ['src']
        }
    }
}

dependencies {
	compile \
		fileTree(dir: "${webAppDirName}/WEB-INF/lib", include: '*.jar'),
		'commons-codec:commons-codec:1.6',
		'commons-lang:commons-lang:2.5',
		'com.hynnet:commons-lang3:3.3.2',
		'org.apache.derby:derby:10.8.2.2',
		'org.glassfish.jersey.core:jersey-server:2.27',
		'org.glassfish.jersey.containers:jersey-container-servlet:2.27',
		'org.glassfish.jersey.inject:jersey-hk2:2.27',
		'log4j:log4j:1.2.16',
		'org.apache.wink:wink-json4j:1.4'
	providedCompile \
		'javax:javaee-api:7.0'
}

war {
	archiveName 'altoromutual.war'
	exclude 'WEB-INF/classes/**/*.class'
	exclude 'WEB-INF/lib/**/*.jar'
}
