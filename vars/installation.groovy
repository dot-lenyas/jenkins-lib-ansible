def call(liferay_password, liferay_login)
{
     git 'https://github.com/dot-lenyas/ansible-liferay'
     ansiblePlaybook inventory: 'hosts', playbook: 'setup.yaml',  extras: "-e \"liferay_user=${liferay_login} admin_password=${liferay_password}\""  
}
