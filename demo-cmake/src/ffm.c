#include "ffm.h"
#include <malloc.h>
#include <stdio.h>

void forEach(int array[], int length, OnEach onEach) {
	for (int i = 0; i < length; ++i) {
		onEach(array[i]);
	}
}

void dumpPerson(Person *person) {
	printf("Person%%%lld(id=%lld, name=%s, age=%d)\n", sizeof(Person),
		person->Id, person->Name, person->Age);

	char *p = (char *)person;
	for (int i = 0; i < sizeof(Person); ++i) {
		printf("%x, ", *p++);
	}
	printf("\n");
}

const char* getName() {
	return "icuxika";
}

const char **getNames() {
	const char **names = (const char **)malloc(3 * sizeof(const char *));
	names[0] = "David";
	names[1] = "Nancy";
	names[2] = NULL;
	return names;
}