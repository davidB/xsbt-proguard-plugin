resolvers += Resolver.url("Typesafe Repo", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)

//libraryDependencies <+= sbtVersion("org.scala-tools.sbt" %% "scripted-plugin" % _)

addSbtPlugin("com.mimesis_republic" %% "mimesis-republic-sbt-plugins" % "1.0.0-SNAPSHOT")
