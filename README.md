# Java-GenAI-Forward-Deployed-Engineer-workbench
Hands-on Java GenAI engineering lab building and iteratively upgrading production-ready AI applications—covering RAG pipelines, agentic tool calling, and Forward Deployed Engineering workflows.

## IntegrateLLM application

The Spring Boot application is in `IntegrateLLM/`. It requires Java 21 and an OpenRouter API key.
Set `OPENROUTER_API_KEY` before starting the application; do not commit the key.

From the `IntegrateLLM` directory, run:

```powershell
$env:OPENROUTER_API_KEY = "<your-key>"
.\mvnw.cmd spring-boot:run
```
