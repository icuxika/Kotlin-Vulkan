#include "ffm.h"
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	Person person = {.Id = 1000000, .Name = "icuxika", .Age = 30};
	dumpPerson(&person);

	printf("%lld\n", sizeof(long long));
	printf("%lld\n", sizeof(int));

	const char* name = getName();
	printf("%s\n", name);

	const char **names = getNames();
	int i = 0;
	while (names[i] != NULL) {
		printf("%s\n", names[i]);
		i++;
	}
	free(names);
	return 0;
}