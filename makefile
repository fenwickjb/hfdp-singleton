
JFLAGS = -d bin -sourcepath src

default:
	@echo "'make clean' removes *.class *~ files"
	@echo "'make compile' compiles all Java files"
	@echo "'make classic' runs classic singleton demo"
	@echo "'make threadsafe' runs threadsafe singleton demo"

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

threadsafe: bin/ThreadsafeSingletonClient.class
	java -cp bin ThreadsafeSingletonClient 1000000
	java -cp bin ThreadsafeSingletonClient 10000000
	java -cp bin ThreadsafeSingletonClient 100000000



