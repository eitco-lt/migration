# Quick Start

## Prerequisites

- Java 21 (configured in project)
- Gradle (included via wrapper)

## Start the Document Management System Mock API

```bash
./gradlew :mock-backend:run
```

The server will start on `http://localhost:8080`

# Task

An export from a legacy system (see: `test-data/`) needs to be migrated to a document management system.

The Document Management System API is documented in [`openapi.yaml`](openapi.yaml).

Your implementation goes in the `migration/` module.


## Requirements

1. Migrate the valid documents from the legacy system to the new system.
2. Handle invalid documents gracefully.
3. Report the migration result.
4. Optional: make the migration resumable.