# See here for image contents: https://github.com/microsoft/vscode-dev-containers/tree/v0.234.0/containers/alpine/.devcontainer/base.Dockerfile

# [Choice] Alpine version: 3.14, 3.13, 3.12, 3.11
ARG VARIANT="3.15"
FROM mcr.microsoft.com/vscode/devcontainers/base:0-alpine-${VARIANT}

# ** [Optional] Uncomment this section to install additional packages. **
RUN sudo apk update \
    && sudo apk add --no-cache openjdk11
