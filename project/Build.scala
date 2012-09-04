import sbt._
//import ScriptedPlugin._
import Keys._
import com.mimesis_republic.sbt.MimesisRepublicPlugin
import MimesisRepublicPlugin._

import scala.xml.{Elem, Node}

object ProguardPlugin extends Build {
  /*
	def pomPostProcessTask(node: Node) = node match {
		case xml: Elem =>
			val children = Seq(
				<url>http://github.com/siasia/xsbt-web-plugin</url>,
				<licenses>
					<license>
						<name>GPLv2</name>
						<url>http://www.gnu.org/licenses/gpl-2.0.html</url>
						<distribution>repo</distribution>
					</license>
				</licenses>,
				<scm>
					<connection>scm:git:git@github.com:siasia/xsbt-proguard-plugin.git</connection>
					<developerConnection>scm:git:git@github.com:siasia/xsbt-proguard-plugin.git</developerConnection>
					<url>git@github.com:siasia/xsbt-proguard-plugin.git</url>
				</scm>,
				<developers>
					<developer>
						<id>siasia</id>
						<name>Artyom Olshevskiy</name>
						<email>siasiamail@gmail.com</email>
					</developer>
				</developers>,
				<parent>
					<groupId>org.sonatype.oss</groupId>
					<artifactId>oss-parent</artifactId>
					<version>7</version>
				</parent>
			)
		xml.copy(child = xml.child ++ children)
	}
	*/
	def rootSettings: Seq[Setting[_]] = Seq(
//		scriptedBufferLog := false,
		sbtPlugin := true,
//		projectID <<= (organization,moduleName,version,artifacts,crossPaths){ (org,module,version,as,crossEnabled) =>
//			ModuleID(org, module, version).cross(crossEnabled).artifacts(as : _*)
//		},
		name := "xsbt-proguard-plugin",
		organization := "com.github.siasia",
    version := "0.2.0",
		libraryDependencies += "net.sf.proguard" % "proguard-base" % "4.8",
		scalacOptions += "-deprecation"
	)
	lazy val root = Project("root", file(".")) settings(mimesisRepublicSettings ++ /*scriptedSettings ++ */rootSettings :_*)
}
