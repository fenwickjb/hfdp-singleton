
JFLAGS = -d bin -sourcepath src

default:
	@echo "'make clean' removes *.class *~ files"
	@echo "'make compile' compiles all Java files"
	@echo "'make classic' runs classic singleton demo"
	@echo "'make super' runs superclass singleton demo"

clean:
	rm -f bin/*.class
	rm -f src/*~
	rm -f *~

compile: 
	javac $(JFLAGS) -cp . src/*.java

classic: bin/ClassicSingletonClient.class
	java -cp bin ClassicSingletonClient 1000000
	java -cp bin ClassicSingletonClient 10000000
	java -cp bin ClassicSingletonClient 100000000

super: bin/SuperclassSingletonClient.class
	java -cp bin SuperclassSingletonClient 


